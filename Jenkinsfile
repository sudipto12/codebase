pipeline {
    agent any
    
    stages{
        stage('Build'){
            steps{
                sh 'mvn clean compilie'
            }
        }
    }
    stages{
        stage('Test'){
            steps{
                sh 'mvn clean test'
            }
        }
    }
    stages{
        stage('deploy'){
            steps{
                sh 'mvn clean install'
            }
        }
    }
}