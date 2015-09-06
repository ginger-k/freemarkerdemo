<html>
<head>
  <title>Welcome!</title>
</head>
<body>
	<div>
		${root.book.title} -- ${root.book.price?string["0.00"]} -- ${root.book.publishDate?date}<br/>
	</div>
</body>
</html>