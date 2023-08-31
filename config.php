<?php 
$host = "localhost:3306"; 
$user = "rigani"; 
$password = "Modao"; 
$dbname = "kathai"; 
$con = mysqli_connect($host, $user, $password,$dbname); 
if (!$con) { 
   die("Connection failed: " . mysqli_connect_error()); 
}