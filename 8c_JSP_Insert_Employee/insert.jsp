<%@ page import="java.sql.*" %>
<html>
<head><title>Employee Report</title></head>
<body>

<%
    String empno = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String basicsalary = request.getParameter("basicsalary");

    Connection conn = null;
    PreparedStatement ps = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");

        // Insert record
        String insertQuery = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)";
        ps = conn.prepareStatement(insertQuery);
        ps.setInt(1, Integer.parseInt(empno));
        ps.setString(2, empname);
        ps.setDouble(3, Double.parseDouble(basicsalary));
        ps.executeUpdate();

        // Fetch and display all records
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");
%>

<h2>Employee Table Report</h2>
<table border="1">
    <tr>
        <th>Employee Number</th>
        <th>Employee Name</th>
        <th>Basic Salary</th>
    </tr>

<%
        while(rs.next()) {
%>
    <tr>
        <td><%= rs.getInt("Emp_NO") %></td>
        <td><%= rs.getString("Emp_Name") %></td>
        <td><%= rs.getDouble("Basicsalary") %></td>
    </tr>
<%
        }
    } catch(Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        if(rs != null) rs.close();
        if(ps != null) ps.close();
        if(stmt != null) stmt.close();
        if(conn != null) conn.close();
    }
%>
</table>

</body>
</html>
