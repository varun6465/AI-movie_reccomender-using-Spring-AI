Spring AI Movie Recommendation System
About
This repository hosts the Spring AI Movie Recommendation System, a modern, AI-powered application built with Spring Boot and integrated with Azure OpenAI for generating movie recommendations. The system provides personalized movie suggestions based on user input, such as preferred genres and favorite movies, delivering an interactive and seamless experience.

Features
AI-Powered Recommendations: Leverages Azure OpenAI for personalized and dynamic movie suggestions.
User-Friendly Interface: A sleek and interactive React-based frontend.
Genre and Title-Based Filtering: Allows users to specify their preferences for tailored recommendations.
IMDb Ratings: Displays movie recommendations along with their ratings and metadata.
Responsive Design: Optimized for desktop and mobile platforms.


Tech Stack
Backend:
Spring Boot
RESTful APIs
Integration with Azure OpenAI


Frontend:
React.js
CSS for responsive and modern design


Database:
PostgreSQL (or H2 for local testing)


Cloud:
Azure Services
Getting Started


Prerequisites
Java 17 or above
Node.js
Azure OpenAI API Key
PostgreSQL or H2 Database


Clone the Repository
bash

git clone https://github.com/your-username/spring-ai-movie-recommendation.git  
cd spring-ai-movie-recommendation  

Backend Setup
Navigate to the backend folder:

bash
Copy code
cd backend  
Configure application properties:

Add your Azure OpenAI key and database credentials in application.properties.
Build and run the Spring Boot application:

bash
Copy code
./mvnw spring-boot:run  
Frontend Setup
Navigate to the frontend folder:
bash
Copy code
cd frontend  


Install dependencies:
bash
npm install  
Start the React development server:
bash
Copy code
npm start  


Usage
Open the application in your browser at http://localhost:3000.
Enter your favorite movie or genre in the input fields.
View the AI-generated movie recommendations with IMDb ratings and metadata.
Demo
Insert a GIF or screenshot of the application in action.

License
This project is licensed under the MIT License.

Contributions
Contributions are welcome! Feel free to open issues or submit pull requests.
