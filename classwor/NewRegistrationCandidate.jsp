

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
     
    <title>Enrollment</title>
    
    <script type="text/javascript" src="../js/jquery-1.4.min.js"></script>
	<script type="text/javascript" src="../js/jquery.validatelib.js"></script>
	<script type="text/javascript" src="../js/jquery.blockUI.js"></script>
  
  <script>
	  function publicExamType(){
    		var publicExamType = document.getElementById("examType1").value;
    		window.location = "CandidateRegistration.jsp?examType="+publicExamType;
    	}
    	
    	function corporateExamType(){
    		document.getElementById("companyCode").style.display = "block";
    	}
    	
    	function onLoad(){
    		document.getElementById("examType1").checked = false;
    		document.getElementById("examType2").checked = false;
    		document.getElementById("companyCodeText").value = "";
    		document.getElementById("companyCode").style.display = "none"; 
    	}
    	
    	function submit(){
    	
    		var corporateExamType = "";
    		
    		if(document.getElementById("examType1").checked == false && document.getElementById("examType2").checked == false){
    			alert("Please select Exam Type.");
    			return false;
    		}
    		
    		if(document.getElementById("companyCodeText").value == ""){
    			alert("Please enter Company Code.");
    			return false;
    		}
    		
    		if(document.getElementById("examType2").checked == true){
    			corporateExamType = document.getElementById("examType2").value;
    		}
    		
    		var companyCode = document.getElementById("companyCodeText").value;
    		if(companyCode!=""){
				var dataString = "companyCode="+companyCode;
				$.ajax({
					type: "POST",
				    url: "VerifyCorporateCode.jsp",
				    data: dataString,
				    beforeSend: function(){
					    
			    	},
				    success: function(data){
						 if(data == 0){
							window.location = "CandidateRegistration.jsp?examType="+corporateExamType+"&corporateCode="+companyCode;			 	
						 }else{
						 	alert("Please provide correct Company Code.");
						 	return false;	
						 }
				   	},//end of success function.
			    	error: function(data){
				    		//alert('!!!!!!!!! error in ajax call : test centers!!!!!!!!!');
				    	}
				    });
		    }//end of if 
    		
    	
    	}
  </script>
    
  </head>
  
  <body onload="onLoad()">
  


	<link type="text/css" href="../css/itb.css" rel="stylesheet"/>
	<div >
	<table border="0" cellpadding="0" cellspacing="0" width="100%">	
 	<tr>
 		<td>
 			<table border="0" cellpadding="0" cellspacing="0" width="100%">
			  <tbody>
<!--				<tr>-->
<!--				  <td colspan="5" background="../images/top_orange_bg.jpg">&nbsp;</td>-->
<!--				</tr>-->
				<tr>
				  <td width="2%">&nbsp;</td>
				  <td width="32%"><div id="nseitlogo"> <img src="/OESWeb/images/nseitlogo.gif" border="none"/></div></td>
				  <td width="48%">&nbsp;</td>
				  <td valign="top" width="17%"><table border="0" cellpadding="0" cellspacing="0" width="100%">
					<tbody>
					  <tr>
						<td>&nbsp;</td>
					  </tr>
					  <tr>
						<td align="right"><img src="/OESWeb/images/indian_testing_board.png" border="nonr" 
			height="81" width="170" /></td>
					  </tr>
					</tbody>
				  </table></td>
				  <td width="1%">&nbsp;</td>
				</tr>
				<tr>
				  <td height="55" colspan="5" align="left" valign="top" background="/OESWeb/images/left_green_patti.jpg"><table border="0" 
			cellpadding="0" cellspacing="0" width="100%">
					<tbody>
					  <tr background="../images/grey_bt_bg.jpg">
						<td background="../images/grey_bt_bg.jpg" 
			height="41" valign="top"><table border="0" cellpadding="0" 
			cellspacing="0" width="100%">
						  <tbody>
							<tr>
							  <td background="/OESWeb/images/left_green_patti.jpg" height="41">&nbsp;</td>
							</tr>
						  </tbody>
						</table></td>
					  </tr>
					</tbody>
				  </table></td>
				</tr>
			  </tbody>
			</table>
 		</td>
 	</tr>
 	<tr>
	 <td height="30">&nbsp; </td>
	</tr>
 	<tr>
 	<td>
  	
  

  
  	<table class="apptable" align="center" >
  	<tr>
  		<th colspan="2">Enrollment</th>
  	</tr>
	<tr>
		<td><span style="color: red">*</span> Exam Type : </td>
		<td>
			<input type="radio" style="width: 26" id="examType1" name="examType" value="P" onclick="publicExamType()">Public
			<input type="radio" style="width: 26" id="examType2" name="examType" value="C" onclick="corporateExamType()">Corporate 
		</td>
	</tr>
	<tr id="companyCode">
			<td><span style="color: red">*</span> Please Provide Company Code : </td>
			<td><input type="text" style="width: 150" id="companyCodeText" name="companyCodeText"></td>
	</tr>
	</table>
	<br>
	<div align="center">
		<input type="submit" name="Submit" class="submit" value="Submit" onclick="submit()">
		<input type="submit" name="Reset" class="submit" value="Reset" onclick="window.location='../registration/NewRegistrationCandidate.jsp'">
		<input type="submit" name="Back" class="submit" value="Back" onclick="window.location='../Login/loginPage.jsp'">
	</div>

   


	</td>
  </tr>
	<tr>
	  <td>&nbsp;</td>
  </tr>



  <tr  id="copyright">
	<td width="100%" height="20" bgcolor="#115A51" class="copyrighttext">Copyright © 2010 NSE.IT All Rights Reserved | Best viewed with Internet Explorer 7.0 to 9.0</td>
  </tr>
  <tr id="copyright1">
  	<td width="100%" height="20" bgcolor="#115A51" class="copyrighttext">Version # ITB_Candidate_1.0.22.1</td>
  </tr>
  </table>
  </div>
 
  </body>
</html>
