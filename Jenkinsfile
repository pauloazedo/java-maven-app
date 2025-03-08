pipeline {
    agent any

    environment {
        // Define environment variables here (if needed)
        // Example: MY_ENV_VAR = 'value'
    }

    stages {
        stage('Build') {
            steps {
                script {
                    // This is where you can add build commands (e.g., compile your application)
                    echo 'Building the application...'
                    // Example: sh 'make build' or any other build tool you use
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Add your testing commands here (e.g., unit tests)
                    echo 'Running tests...'
                    // Example: sh 'npm test' or any test command for your project
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Deployment steps go here
                    echo 'Deploying application...'
                    // Example: sh 'deploy.sh' or any deployment command for your environment
                }
            }
        }
    }

    post {
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}

