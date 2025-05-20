<%@ page import="java.sql.*" %>
<html>
<head><title>Update Result</title></head>
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

        // Update record
        String updateQuery = "UPDATE Emp SET Emp_Name = ?, Basicsalary = ? WHERE Emp_NO = ?";
        ps = conn.prepareStatement(updateQuery);
        ps.setString(1, empname);
        ps.setDouble(2, Double.parseDouble(basicsalary));
        ps.setInt(3, Integer.parseInt(empno));

        int updated = ps.executeUpdate();

        if (updated > 0) {
            out.println("<h3>Record updated successfully!</h3>");
        } else {
            out.println("<h3>No record found with Emp_NO: " + empno + "</h3>");
        }

        // Display table
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");
%>

<h2>Employee Table After Update</h2>
<table border="1">
    <tr>
        <th>Emp_NO</th>
        <th>Emp_Name</th>
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
