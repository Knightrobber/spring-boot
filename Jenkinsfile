pipeline {
    agent any
    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh './mvnw test'
            }
        }
        stage('Build Docker Image'){
            steps{
                sh 'docker build -t jenkins-aws-proj'
            }
        }
        stage('Run Docker Image'){
            steps{
                sh 'docker run -d -p 8081:8081 --name jenkins-aws-proj'
            }
        }

    }
}