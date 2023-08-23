<?php 
$host = "localhost:3306"; /* Host name */ 
$user = "rigani"; /* User */ 
$password = "Modao"; /* Password */ 
$dbname = "kathai"; /* Database name */ 
$con = mysqli_connect($host, $user, $password,$dbname); 
// Check connection 
if (!$con) { 
   die("Connection failed: " . mysqli_connect_error()); 
}