<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Coffee Names Starting with 'D'</title>
</head>
<body>
    <h2>Coffee Names Starting with 'D'</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Coffee Name</th>
        </tr>

<%
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        // Load JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC",
            "root", 
            ""   // ✅ Replace with your MySQL password
        );

        // Query coffee names starting with 'D'
        String query = "SELECT * FROM coffee WHERE name LIKE 'D%'";
        stmt = conn.createStatement();
        rs = stmt.executeQuery(query);

        // Display results
        while(rs.next()) {
%>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("name") %></td>
        </tr>
<%
        }
    } catch(Exception e) {
        out.println("<tr><td colspan='2'>Error: " + e.getMessage() + "</td></tr>");
    } finally {
        try { if(rs != null) rs.close(); } catch(Exception e) {}
        try { if(stmt != null) stmt.close(); } catch(Exception e) {}
        try { if(conn != null) conn.close(); } catch(Exception e) {}
    }
%>
    </table>
</body>
</html>
