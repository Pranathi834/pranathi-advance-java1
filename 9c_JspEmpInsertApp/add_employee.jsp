<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Records</title>
</head>
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
        conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/Employee?useSSL=false&serverTimezone=UTC",
            "root", ""
        );

        if (empno != null && empname != null && basicsalary != null) {
            String insertSQL = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)";
            ps = conn.prepareStatement(insertSQL);
            ps.setInt(1, Integer.parseInt(empno));
            ps.setString(2, empname);
            ps.setBigDecimal(3, new java.math.BigDecimal(basicsalary));
            ps.executeUpdate();

            out.println("<p style='color:green;'>Employee added successfully!</p>");
        }

        // Display all employees
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");
%>
    <h3>Employee Records</h3>
    <table border="1">
        <tr>
            <th>Emp_NO</th>
            <th>Emp_Name</th>
            <th>Basic Salary</th>
        </tr>
<%
        while (rs.next()) {
%>
        <tr>
            <td><%= rs.getInt("Emp_NO") %></td>
            <td><%= rs.getString("Emp_Name") %></td>
            <td><%= rs.getBigDecimal("Basicsalary") %></td>
        </tr>
<%
        }
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        if (rs != null) try { rs.close(); } catch(Exception e) {}
        if (stmt != null) try { stmt.close(); } catch(Exception e) {}
        if (ps != null) try { ps.close(); } catch(Exception e) {}
        if (conn != null) try { conn.close(); } catch(Exception e) {}
    }
%>
    </table>
</body>
</html>
