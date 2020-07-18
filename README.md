# Blood Volume Calculator
Blood volume calculator ia an API created using Spring boot. 
The formula was obtained from nadler's formula for calculating blood volume.

# Request Format

{ <br/>
  "gender":gender, <br/>
  "height":height in CM, <br/>
  "weight": weight in KG <br/>
}
<br/>
# Response Format

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


