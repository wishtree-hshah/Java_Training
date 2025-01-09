## OAuth2:

- OAuth 2.0 is an authorization framework that allows applications to access a user's resources (like data or services) on another system securely without sharing the user's credentials. It issues tokens to grant temporary access to resources.

### Flow: 

![alt text]({B5FC8E6D-55B6-4CEC-9A47-965526A1ECF4}.png)

- Resource Owner:
    - The user who owns the data.
    - Example: You, the user, who wants to share your Google Drive data.

- Client:
    - The application requesting access to the user's data.
    - Example: A photo-editing app.

- Resource Server:
    - The server hosting the protected resources.
    - Example: Google Drive's API.

- Authorization Server:
    - Issues access tokens after user authentication.
    - Example: Google's OAuth2 server

### OAuth Grant Types:

1. Authorization Code Flow:

![alt text]({C85F8FCD-F6AF-4012-93DA-3A2A323C4264}.png)

- The client requests authorization by directing the resource owner to the authorization server.
- The authorization server authenticates the resource owner and informs the user about the client and the data requested by the client. Clients cannot access user credentials since authentication is performed by the authentication server.
- Once the user grants permission to access the protected data, the authorization server redirects the user to the client with the temporary authorization code.
- The client requests an access token in exchange for the authorization code.
- The authorization server authenticates the client, verifies the code, and will issue an access token to the client.
- Now the client can access protected resources by presenting the access token to the resource server.
- If the access token is valid, the resource server returns the requested resources to the client.