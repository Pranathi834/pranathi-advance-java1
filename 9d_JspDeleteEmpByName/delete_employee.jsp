<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Records After Deletion</title>
</head>
<body>
<%
    String startLetter = request.getParameter("startLetter");

    Connection conn = null;
    Statement stmt = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/Employee?useSSL=false&serverTimezone=UTC",
            "root", ""
        );

        if (startLetter != null && !startLetter.trim().isEmpty()) {
            String deleteSQL = "DELETE FROM Emp WHERE Emp_Name LIKE ?";
            ps = conn.prepareStatement(deleteSQL);
            ps.setString(1, startLetter + "%");
            int rowsDeleted = ps.executeUpdate();

            out.println("<p style='color:blue;'>Deleted " + rowsDeleted + " employee(s) whose name started with '" + startLetter + "'</p>");
        }

        // Display remaining records
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");
%>
    <h3>Remaining Employee Records</h3>
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
