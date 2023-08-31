<?php 
include "config.php"; 

$query = "SELECT Book_Id, Title, Authors FROM mytable";
$result = mysqli_query($con, $query);

$response = array();
while ($row = mysqli_fetch_assoc($result)) {
    $response[] = $row;
}

echo json_encode($response);
exit;
?>
