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
                bat 'docker build -t jenkins-aws-proj .'
            }
        }
        stage('Run Docker Image'){
            steps{
                bat 'docker run -d -p 8082:8083 --name jenkins-aws-proj jenkins-aws-proj'
            }
        }

    }
}