<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Weather Assignment</title>
    <style>
        body {
            background-color: #0e0e0e;
            color: #fff;
            font-family: Arial, sans-serif;
            text-align: center;
            margin-top: 250px;
        }
        .container {
            border: 2px solid #fff;
            border-radius: 10px;
            padding: 20px;
            width: 50%;
            margin: 0 auto;
            background-color: rgba(255, 255, 255, 0.1);
            box-shadow: 0 0 20px rgba(255, 255, 255, 0.3);
        }
        label {
            font-size: 1.2em;
        }
        input[type="text"] {
            padding: 10px;
            border: none;
            border-radius: 5px;
            background-color: rgba(255, 255, 255, 0.1);
            color: #fff;
            margin-top: 10px;
            width: calc(100% - 20px);
            max-width: 300px;
        }
        input[type="submit"] {
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            background-color: #008cba;
            color: #fff;
            cursor: pointer;
            margin-top: 20px;
            transition: background-color 0.3s ease;
        }
        input[type="submit"]:hover {
            background-color: #005f75;
        }
        h1 {
            font-size: 2em;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>

    <div class="container">
        <form action="/weather/summary">
            <label><h1>Enter City Name: </h1></label>
            <input type="text" name="city" placeholder="E.g. New York">
            <br><br>
            <input type="submit" value="Get Current Weather">
        </form>
        <form action="/weather/hourly/{city}/">
            <input type="submit" value="Get Hourly Forecast">
        </form>
    </div>
    
</body>
</html>
