# how to contribute
1. clone the repo
2. download postgresql
3. make sure that username and password of postgres admin is the same as the configured one in Application.properties file
4. also check the database name ( it's in datasource url in Application.properties file )
5. run it

# User Authentification and Registration
steps for the user :
1. make a POST request to: http://localhost:8080/registration to register with the body in JSON
````
{
  "firstname":"rabii",
  "lastname":"abouaissa",
  "role":"ADMIN",
  "email":"abouaissarabii@gmail.com",
  "password":"rabii"
}
````
2. you will receive an email for confirmation.
3. clicking the link in the email redirect you to a page that says : Please click on the below link to Login:
the link should be like this ``"http://localhost:8080/login?token=" + token``
4. clicking it would confirm you and redirect you to the /login page
5. type your credentials and then login
6. Login is successful, for now all success login would redirect to the root page ``/``.
### what to configure for this to work :
1. in ``application.properties`` set the sender email (the email that sends confirmation link)
2. set the password ( get the password of your email from google app password , go to account > settings > app password, and create a password of gmail)
3. set the sender email in ``EmailService.java``
4. all done.

# List of API Endpoints

## Home
**Base URL:** `/`
- **GET** `/` – Serve `index.html`

## Registration
**Base URL:** `/registration`
- **POST** `` `` - Register a new user (JSON body as shown above)
- **GET** ``/confirmation``- to confirm user's email (done through confirmation email, no need to make http request to it manually)

## Client
**Base URL:** `/api/client`
- **POST** `/addClient` – Add a new client (JSON body)
- **GET** `/getAllClients` – Retrieve all clients
- **GET** `/{id}` – Get client by ID
- **DELETE** `/{id}` – Delete client by ID
- **DELETE** `/deleteAllClients` – Delete all clients
- **PATCH** `/{id}` – Update client by ID (JSON body)

## Fournisseur
**Base URL:** `/api/fournisseur`
- **POST** `/addfournisseur` – Add a new fournisseur (JSON body)
- **GET** `/getallfournisseur` – Retrieve all fournisseurs
- **GET** `/{id}` – Get fournisseur by ID
- **DELETE** `/{id}` – Delete fournisseur by ID
- **DELETE** `/deleteallfournisseur` – Delete all fournisseurs
- **PATCH** `/{id}` – Update fournisseur by ID (JSON body)

