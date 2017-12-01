<?php
$servername = "DESKTOP-MA03PDG";
$username = "wpuser";
$password = "!1jing110";

// Create connection
$conn = new mysqli($servername, $username, $password);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 
echo "Connected successfully";
?>