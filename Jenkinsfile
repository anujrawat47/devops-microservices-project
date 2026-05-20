pipeline {
    agent any

    environment {
        COMPOSE_FILE = "deployment/docker-compose.yml"
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main',
                url: 'https://github.com/anujrawat47/devops-microservices-project.git'
            }
        }

        stage('Pull Latest Images') {
            steps {
                bat 'docker-compose -f %COMPOSE_FILE% pull'
            }
        }

        stage('Stop Existing Containers') {
            steps {
                bat 'docker-compose -f %COMPOSE_FILE% down'
            }
        }

        stage('Deploy Containers') {
            steps {
                bat 'docker-compose -f %COMPOSE_FILE% up -d'
            }
        }

        stage('Verify Deployment') {
            steps {
                bat 'docker ps'
            }
        }
    }
}