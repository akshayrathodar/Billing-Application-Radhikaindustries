
<!DOCTYPE html>
<html lang="en-US">
	<head>
		<title></title>
			<meta charset="utf-8">
			<meta name="viewport" content="width=device-width, initial-scale=1">

		<style type="text/css">
			body{
				font-family: "Times New Roman", Times, serif;
				font-size:15px;
			}
			.container{
				width:60%;
				margin-top:25%;
				margin:30 auto;
			}
			table{
				border:1px solid blue;
			}
			tr{
			
			}
			td{
				border:1px solid blue;
			}
			.bod{
				
				}
			.cenn{
				text-align:center;
			}
			.cen{
				text-align:center;
				padding-left:10px;
				padding-right:10px;
			}	
			.none{
				border:none;
			}
			.blue{
				color:blue;
			}
		</style>
	</head>
	<body>
	<jsp:useBean id="abc" type="dr.DispBean" 
scope="request" />

	<div class="container">
		<table>
			<tr>
				<!--<th class="bod" colspan="12"><u>QUOTATION</u></th>-->
				<td class="cen" colspan="12"><u><b>TAX INVOICE</b></u></td>
			</tr>
			<tr>
				<td class="bod blue">M/s. :</td>
				<td class="bod" colspan="9"><b><jsp:getProperty name="abc" property="pnm" /></b></td> 
				<td rowspan="2" class="cen">No.</td>
				<td rowspan="2" class="cen"><jsp:getProperty name="abc" property="bno" /></td>
				
			</tr>
			<tr>
				<td class="bod"  colspan="10"  style="padding-top:10px;padding-bottom:10px;"><jsp:getProperty name="abc" property="padd"/><span style="float:right;"> MO : +91 93736 01875.</span>
					<br/>EMAIL : pentagon@pentagonmachines.com</td>
			</tr>
			<tr>
				<td colspan="10" class=""><b>GST NO : <jsp:getProperty name="abc" property="gno"/></b></td>
				<td style="text-align:center;">Date</td>
				<td style="text-align:center;"><jsp:getProperty name="abc" property="date" /> </td>
			</tr>
			<tr>
				<td colspan="12" class=""><b>STATE:- <jsp:getProperty name="abc" property="state" /> </b></td>
			</tr>
			<tr  style="background: #e2e2e2;">
				<td  class="bod"><b>Sr.No.</b></td>
				<td colspan="5"><b>Product Name</b></td> 
				<td colspan="1" class="cen"><b>HSN</b></td>
				<td colspan="2" class="cen"><b>Qty</b></td>
				<td colspan="2" class="cen"><b>Rate</b></td>
				<td colspan="2" class="cen"><b>Amount</b></td>
			</tr>
			<tr>
				<td  class="bod">1</td>
				<td colspan="5"><jsp:getProperty name="abc" property="mnm" /> <br/><br/><br/><br/><br/><br/>
<pre><b>A/C Name: - </b>Radhika Industries
<b>Bank Name: - </b>Punjab National Bank
<b>Branch - </b>shiv nagar gondal road Rajkot(Guj.)
<b>A/C No:- </b>3870002100010437<br/><b>RTGS/NEFT IFS CODE –</b> PUNB0387000</pre>
				</td> 
									
				<td colspan="1" class=""style="text-align:center;padding-left:10px;padding-right:10px">8207</td>
				<td colspan="2" style="text-align:center;padding-left:10px;padding-right:10px"><jsp:getProperty name="abc" property="qty" /></td>
				<td colspan="2" style="text-align:center;padding-left:10px;padding-right:10px"><jsp:getProperty name="abc" property="price" /> <br></td>
				<td colspan="2" style="text-align:center;padding-left:10px;padding-right:10px"><jsp:getProperty name="abc" property="price" /> <br></td>
			</tr>

			<tr>
				<td  class="bod">Sr.No.</td>
				<td colspan="5">Product Name</td> 
				<td colspan="1" style="text-align:center;padding-left:10px;padding-right:10px">HSN</td>
				<td colspan="2" style="text-align:center;padding-left:10px;padding-right:10px">Qty</td>
				<td colspan="2" style="text-align:center;padding-left:10px;padding-right:10px">Rate</td>
				<td colspan="2" style="text-align:center;padding-left:10px;padding-right:10px">Amount</td>
			</tr>
			<tr>
				
				<td class="cenn" colspan="2"><b>CGST</b></td>
				<td class="cenn"  colspan="2"><b>SGST</b></td>
				<td class="cenn"  colspan="2"><b>GST</b></td>
				<td class="cenn" colspan="5"><b>TOTAL AMOUT BEFORE TAX</b></td>
				<td colspan="1"><jsp:getProperty name="abc" property="price" /></td>
			</tr>
			<tr>
				<td >RATE</td>
				<td >TAX</td>
				<td >RATE</td>
				<td >TAX</td>
				<td >RATE</td>
				<td >TAX</td>
				<td colspan="5"><b>ADD : CGST(9%)</b></td>
				<td colspan="1" style="text-align:center;padding-left:10px;padding-right:10px"><jsp:getProperty name="abc" property="cgst" /> </td>
			</tr>
			<tr>
				<td >9</td>
				<td ><jsp:getProperty name="abc" property="cgst" /> </td>
				<td >9</td>
				<td ><jsp:getProperty name="abc" property="sgst" /> </td>
				<td >18</td>
				<td ><jsp:getProperty name="abc" property="igst" /> </td>
				<td colspan="5"><b>ADD : SGST(9%)</b></td>
				<td colspan="1" style="text-align:center;padding-left:10px;padding-right:10px"><jsp:getProperty name="abc" property="sgst" /> </td>
			</tr>
			<tr>
				<td ></td>
				<td ></td>
				<td ></td>
				<td ></td>
				<td ></td>
				<td ></td>
				<td colspan="5"><b>ADD : IGST(18%)</b></td>
				<td colspan="1" style="text-align:center;padding-left:10px;padding-right:10px"><jsp:getProperty name="abc" property="igst" /> </td>
			</tr>
			<tr>
				
				<td class="bod" colspan=""></td>
				<td class="bod" colspan="10" style="text-align:right;padding-right:60px;"><b>TAX AMOUNT : GST</b></td>
				<td class="bod" colspan="1" style="text-align:center;padding-left:10px;padding-right:10px"><jsp:getProperty name="abc" property="ttax" /></td>
			</tr>
			<tr>
				<td class="bod" colspan="6"><b>GSTIN s:-24ABTPU1038N1Z1</b></td>
				<td class="bod" colspan="5" style=""><b>TOTAL AMOUNT AFTER TAX</b></td>
				<td class="bod" colspan="1" style="text-align:center;padding-left:10px;padding-right:5px"><jsp:getProperty name="abc" property="netamount" /> </td>
			</tr>
			<tr>
				<td class="none" colspan="8"><b>Rs.(in Words) : </b><jsp:getProperty name="abc" property="ew" /></td>
				<td class="none" colspan="4" style="text-align:center;">For, Radhika Industries</td>
			</tr>
			<tr>
				<td class="none" colspan="6"></td>
				<td class="none" colspan="6"  style="background: #e2e2e2;text-align:center;padding:5px;"><u>signature</u></td>
			</tr>
			<tr>
				<td class="none" colspan="7">1) Our Responsibility ceases as soon as goods leave our premises.</td>
				<td class="none" colspan="5">(Authorised Signatory)</td>
				
			</tr>
			<tr>
				<td class="none" colspan="8">2) DILIVERY TIME: 3 WEAK AFTER ORDERING MACHINE</td>
				<td class="none" colspan="4" style="text-align:center;"></td>
			</tr>
		</table>
		</div>
	</body>
</html>