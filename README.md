# how to contribute
1. clone the repo
2. download postgresql
3. make sure that username and password of postgres admin is the same as the configured one in Application.properties file
4. also check the database name ( it's in datasource url in Application.properties file )
5. run it

# user authentification and registration
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
2. you will receive an email for comfirmation.
3. clicking the link in the email redirect you to a page that says : Please click on the below link to Login:
the link sould be like this ``"http://localhost:8080/login?token=" + token``
4. clicking it would confirm you and redirect you to the /login page
5. type your credentials and then login
6. Login is succesful, for now all sucess login would redirect to the root page ``/``
# List of API Endpoints
# API Endpoints

## Home
**Base URL:** `/`
- **GET** `/` – Serve `index.html`

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

