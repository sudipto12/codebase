pipeline {
    agent any
    
    stages{
        stage('Build'){
            steps{
                sh 'mvn clean compilie'
            }
        }
		stage('Test'){
            steps{
                sh 'mvn clean test'
            }
        }
		stage('deploy'){
            steps{
                sh 'mvn clean install'
            }
        }
    }
}