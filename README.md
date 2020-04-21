# Spring-boot-jwt based Spring boot
it is JSON Web Token Example using IntelliJ IDEA IDE.



                  ----------------------------------------------
                          get for Token details
                         username ::: akashKumar
                         password ::: akash
                  ----------------------------------------
IDE ::
IntelliJ IDEA

technologies ::
JAVA8,
Spring Security,
JwtToken V0.9,
Dev-tools,
lombok,
Maven,


                                        for Testing using POSTMAN

Request Type :::: POST

URL ::: >>>  localhost:8191/JWTExample/authenticate

Request body ::::>>>>

            {
	              "username":"akashKumar",
	              "password":"akash"
            }
            
Response :::::>>>>>

{
  
  		"jwtToken":          	
"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJha2FzaEt1bWFyIiwiZXhwIjoxNTg3NDg0MTIzLCJpYXQiOjE1ODc0NjYxMjN9.CenrD4E4ZGNnNGH8MqkZi154PC1FYZP-b3esiaLSj7xr9IS6uKrnsOcO48xknezLtzB2tPeWAiNGHD4QAXtkWg"

}




	:::::::::::::::::::::Image path for more desc of API ::::::::::::::::::::::::: 
	
	Spring-boot-jwt/src/main/resources/templates/responseImg.png
