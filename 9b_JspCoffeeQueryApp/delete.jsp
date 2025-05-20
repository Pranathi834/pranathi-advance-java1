<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Coffee Records</title>
</head>
<body>
    <h2>Coffee Records After Deletion</h2>

<%
    String idToDelete = request.getParameter("id");
    Connection conn = null;
    PreparedStatement deleteStmt = null;
    Statement selectStmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC",
            "root", 
            ""  // ✅ Replace with your actual password
        );

        // ✅ Delete coffee with the given ID
        if (idToDelete != null && !idToDelete.isEmpty()) {
            String deleteSQL = "DELETE FROM coffee WHERE id = ?";
            deleteStmt = conn.prepareStatement(deleteSQL);
            deleteStmt.setInt(1, Integer.parseInt(idToDelete));
            deleteStmt.executeUpdate();
            out.println("<p style='color:green;'>Deleted coffee with ID: " + idToDelete + "</p>");
        }

        // ✅ Fetch remaining records
        String selectSQL = "SELECT * FROM coffee";
        selectStmt = conn.createStatement();
        rs = selectStmt.executeQuery(selectSQL);
%>

    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
        </tr>
<%
        while (rs.next()) {
%>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("name") %></td>
        </tr>
<%
        }
    } catch(Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        if (rs != null) try { rs.close(); } catch (Exception e) {}
        if (selectStmt != null) try { selectStmt.close(); } catch (Exception e) {}
        if (deleteStmt != null) try { deleteStmt.close(); } catch (Exception e) {}
        if (conn != null) try { conn.close(); } catch (Exception e) {}
    }
%>
    </table>
</body>
</html>
