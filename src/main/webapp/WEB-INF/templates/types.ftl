<html>
<head>
  <title>Welcome!</title>
</head>
<body>
  	<div>${author.name} -- <#if author.gender>男<#else>女</#if> -- ${author.birthday?date}</div>
  	<div>${author.name} -- ${author.gender?string("男", "女")} -- ${author.birthday?datetime}</div>
  	<div>
  		<#list author.books as book>
			${book.title} -- ${book.price?string["0.00"]} -- ${book.publishDate?date}<br/>
		</#list>
	</div>
</body>
</html>