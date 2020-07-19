# Blood Volume Calculator
Blood volume calculator ia an API created using Spring boot. 
The formula was obtained from nadler's formula for calculating blood volume.

# Request Format for Body Mass Index 

{ <br/>
  "height":height in CM, <br/>
  "weight": weight in KG <br/>
}
<br/>
# Response Format for Body Mass Index

{ <br/>
    "result": Result string ,  <br/>
    "response": "OK", <br/>
    "weight": Weight in KG, <br/>
    "height": Height in CM, <br/>
    "bmi": BMI value <br/>
} <br/>

# Request Format for Blood Volume Calculation 

{ <br/>
  "gender":gender, <br/>
  "height":height in CM, <br/>
  "weight": weight in KG <br/>
}
<br/>
# Response Format for Blood Volume Calculation

{ <br/>
  "volume": Blood Volume in Litres, <br/>
    "gender": gender, <br/>
    "response": "OK", <br/>
    "weight": weight in KG, <br/>
    "height": Height in metres <br/>
} <br/>

<img src="Images/Execution.png" />
<hr/>
<img src="Images/Result.png" />
<hr/>


