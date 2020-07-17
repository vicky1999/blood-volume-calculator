# blood-volume-calculator
Blood volume calculator application created using Spring boot.  The application was created as an api.
The formula is obtained from nadler's formula for calculating blood volume.

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


