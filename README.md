# how to contribute
1. clone the repo
2. download postgresql
3. make sure that username and password of postgres admin is the same as the configured one in Application.properties file
4. also check the database name ( it's in datasource url in Application.properties file )
5. run it
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

