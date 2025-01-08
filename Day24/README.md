# JWT (Json Web Token):

### JWT Structure:
![alt text]({5851E0E5-F847-4BA0-B8C3-221D8C3B944D}.png)

### Where to store JWT securely?
- In Local Storage, but JS sometimes can access it
- In session Storage
- In Cookies
- But it's better to expire JWT after few minutes and then if new request arrives regenerate it is most secure

### Session vs JWT:

![alt text]({0B489F9E-5136-45A9-BEFC-5FF36F0C69B1}.png)

![alt text]({3F75BE29-831F-464A-81F6-D72D8800833D}.png)

### How JWT Works
Authentication Flo34w:

- Login: A user authenticates (e.g., username/password).
- Token Issuance: Server generates a JWT containing
user claims and signs it.
- Client Stores Token: Token is stored (e.g., Local Storage, Cookies).
- Request Authentication: On subsequent requests, the client sends the token (usually in the Authorization header as a Bearer token).
- Server Validates: Server verifies the signature and checks claims (e.g., expiration).