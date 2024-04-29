# Weather API Integration with Spring Boot

This project demonstrates integrating the Weather API from Rapid API with a Spring Boot server to provide weather forecast information through RESTful APIs.

## APIs Provided

### API 1: Get Weather Forecast Summary

- **Endpoint**: `/weather/summary`
- **Method**: `GET`
- **Parameters**: 
  - `city`: Name of the city for which weather forecast summary is requested
- **Description**: Provides a summary of weather forecast for the specified city.

### API 2: Get Hourly Weather Forecast Details

- **Endpoint**: `/weather/hourly`
- **Method**: `GET`
- **Parameters**: 
  - `city`: Name of the city for which hourly weather forecast details are requested
- **Description**: Provides hourly weather forecast details for the specified city.

## Authentication

Header-based authentication is used with random client ID and client secret for each request. The following headers need to be included in each request:

- `x-client-id`: Random client ID
- `x-client-secret`: Random client secret

## Usage

1. Clone the repository.
2. Replace `"your-rapid-api-key"` with your actual Rapid API key in the `WeatherApplication.java` file.
3. Run the Spring Boot application.
4. Use the provided APIs to fetch weather forecast information.

## Dependencies

- Spring Boot
- RestTemplate

## References

- Rapid API Documentation: [https://rapidapi.com/wettercom-wettercom-default/api/forecast9](https://rapidapi.com/wettercom-wettercom-default/api/forecast9)
