<html>
<head>
<title> Output </title>
</head>
<body>

<jsp:useBean id="binv" type="bill.billBean" scope="request" />
<jsp:getProperty name="binv" property="bno" /> <br>
<jsp:getProperty name="binv" property="pnm" /> <br>
<jsp:getProperty name="binv" property="mnm" /> <br>
<jsp:getProperty name="binv" property="qty" /> <br>
<jsp:getProperty name="binv" property="price" /> <br>
<jsp:getProperty name="binv" property="cgst" /> <br>
<jsp:getProperty name="binv" property="sgst" /> <br>
<jsp:getProperty name="binv" property="igst" /> <br>
<jsp:getProperty name="binv" property="ttax" /> <br>
<jsp:getProperty name="binv" property="netamount" /> <br>
<jsp:getProperty name="binv" property="state" /> <br>
<jsp:getProperty name="binv" property="date" /> <br>
</body>
</html>