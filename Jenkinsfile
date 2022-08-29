pipeline {
    agent any
    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Build Docker Image'){
            steps{
                bat 'docker build -t jenkins-aws-proj'
            }
        }
        stage('Run Docker Image'){
            steps{
                bat 'docker run -d -p 8081:8081 --name jenkins-aws-proj'
            }
        }

    }
}