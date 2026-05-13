pipeline {
    agent any

    environment {
        DOCKERHUB_CREDENTIALS = 'Docker-credentialss'
        IMAGE_NAME = 'poorvika29/new_push'
    }

    stages {

        stage('Build Java Application') {
            steps {
                bat 'javac prime.java'
            }
        }

        stage('Run Java Program') {
            steps {
                bat 'java prime'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t %IMAGE_NAME%:latest .'
            }
        }

        stage('Login to DockerHub') {
            steps {
                withCredentials([usernamePassword(
                credentialsId: 'Docker-credentialss',
                usernameVariable: 'USER',
                passwordVariable: 'PASS')]) {

                    bat 'echo %PASS% | docker login -u %USER% --password-stdin'
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                bat 'docker push %IMAGE_NAME%:latest'
            }
        }
    }
}
