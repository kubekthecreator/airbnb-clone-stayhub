# StayHub Backend

This repository contains the **backend** of the StayHub property rental platform, built with **Spring Boot 3**. The backend is responsible for handling data persistence, security, and business logic for StayHub.

## Features

- **Robust Backend**: Developed with **Spring Boot 3** for efficient data management and security.
- **Database Management**: Uses **PostgreSQL** for relational data handling.
- **User Authentication**: Integrated with **Auth0** for secure authentication and authorization.
- **Geolocation Services**: Includes integration with third-party APIs for precise geolocation.
- **Review System**: Supports user-generated reviews for properties, enhancing transparency.

## Related Repositories

- **Frontend Repository**: The frontend of StayHub, built with **Angular 17**, is available [here](https://github.com/kubekthecreator/airbnb-clone-stayhub-front).

## Getting Started

To run the StayHub backend locally:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/kubekthecreator/airbnb-clone-stayhub.git
   cd airbnb-clone-stayhub
   ```
2. **Configure the Database**:

- Ensure PostgreSQL is installed and running.
- Update the database configurations in the application.properties file.
  
3. **Run the Application**:
```bash
./mvnw spring-boot:run
```
4. **Access the Backend API**:
- The backend API will be accessible at http://localhost:8080.

## Contributing
Contributions are welcome! Feel free to open issues or submit pull requests.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Contact
For any inquiries or support, reach out to eryk.kubiak.firma@gmail.com.
   
