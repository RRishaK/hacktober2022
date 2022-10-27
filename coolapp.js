<!DOCTYPE html>
<html lang="en">
<script>
	const JSONToCSV = (objArray, keys) => {
		let csv = keys.join(',');
		objArray.forEach((row) => {
			let values = [];
			keys.forEach((key) => {
				values.push(row[key] || '');
			});		objArray.forEach((row) => {
			let values = [];
			keys.forEach((key) => {
				values.push(row[key] || '');
			});		objArray.forEach((row) => {
			let values = [];
			keys.forEach((key) => {
				values.push(row[key] || '');
			});		objArray.forEach((row) => {
			let values = [];
			keys.forEach((key) => {
				values.push(row[key] || '');
			});		objArray.forEach((row) => {
			let values = [];
			keys.forEach((key) => {
				values.push(row[key] || '');
			});		objArray.forEach((row) => {
			let values = [];
			keys.forEach((key) => {
				values.push(row[key] || '');
			});		objArray.forEach((row) => {
			let values = [];
			keys.forEach((key) => {
				values.push(row[key] || '');
			});		objArray.forEach((row) => {
			let values = [];
			keys.forEach((key) => {
				values.push(row[key] || '');
			});		objArray.forEach((row) => {
			let values = [];
			keys.forEach((key) => {
				values.push(row[key] || '');
			});		objArray.forEach((row) => {
			let values = [];
			keys.forEach((key) => {
				values.push(row[key] || '');
			});		objArray.forEach((row) => {
			let values = [];
			keys.forEach((key) => {
				values.push(row[key] || '');
			});		objArray.forEach((row) => {
			let values = [];
			keys.forEach((key) => {
				values.push(row[key] || '');
			});
			csv += '\n' + values.join(',');
		});
		return csv;
	};

	const exampleJSON = [
		{
			"date": 20210307,
			"positives": 28756184,
			"fatalities": 515148
		},
		{
			"date": 20210306,
			"positives": 28714654,
			"fatalities": 514309
		},
		{
			"date": 20210305,
			"positives": 28654639,
			"fatalities": 512629
		},
		{
			"date": 20210304,
			"positives": 28585852,
			"fatalities": 510408
		},
		{
			"date": 20210303,
			"positives": 28520365,
			"fatalities": 508665
		},
		{
			"date": 20210302,
			"positives": 28453529,
			"fatalities": 506216
		},
		{
			"date": 20210301,
			"positives": 28399281,
			"fatalities": 504488
		}
	];
	console.log(JSONToCSV(exampleJSON,
		['date', 'positives', 'fatalities']));
</script>

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content=
		"width=device-width, initial-scale=1.0">

	<link rel="stylesheet" href=
"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
		integrity=
"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
		crossorigin="anonymous">

	<script src="app.js"></script>

	<title>To Do List</title>
</head>

<body>
	<header class="bg-success text-white p-5">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12">
					<font face="Comic sans MS"
						size="11" color="black">
						<strong>ToDo List</strong>
					</font>
					
				</div>
			</div>
		</div>
	</header>

	<div class="container mt-3">
		<h2>Add Items</h2>

		<label id="lblsuccess" class="text-success"
				style="display: none;">
		</label>
		
		<form id="addForm">
			<div class="row">
				<div class="col-lg-7 col-md-7 col-sm-7">

					<input type="text" onkeyup=
						"toggleButton(this, 'submit')"
						class="form-control" id="item">
				</div>

				<div class="col-lg-5 col-md-5 col-sm-5">
				<input type="submit" class="btn btn-dark"
						id="submit" value="Submit" disabled>
				</div>
			</div>
		</form>

		<h3 class="mt-4">Tasks</h3>

		<form id="addForm">
			<ul class="list-group" id="items"></ul>
		</form>
	</div>
</body>

</html>
