pipeline {

agent any

environment {
    JAVA_HOME = 'C:\\Program Files\\Java\\jdk-25.0.3'
    MAVEN_HOME = 'C:\\apache-maven-3.9.15'
    PATH = "${JAVA_HOME}\\bin;${MAVEN_HOME}\\bin;${env.PATH}"
}

stages {

    stage('Checkout') {
        steps {
            checkout scm
        }
    }

    stage('Verify Environment') {
    steps {
        bat 'echo JAVA_HOME=%JAVA_HOME%'
        bat 'java -version'
        bat 'mvn -version'
        bat 'docker --version'
    }
}

    stage('Clean Project') {
        steps {
            bat 'mvn clean'
        }
    }

    stage('Build Project') {
        steps {
            bat 'mvn compile'
        }
    }

    stage('Run TestNG Tests') {
        steps {
            bat 'mvn test'
        }
    }

    stage('Docker Build') {
        steps {
            bat 'docker build -t blazedemo-automation .'
        }
    }

    stage('Docker Run') {
        steps {
            bat 'docker run --rm blazedemo-automation'
        }
    }
}

post {

    always {
        archiveArtifacts artifacts: 'screenshots/*.png', allowEmptyArchive: true
        archiveArtifacts artifacts: 'test-output/**/*.*', allowEmptyArchive: true
    }

    success {
        echo 'BlazeDemo Automation Executed Successfully'
    }

    failure {
        echo 'BlazeDemo Automation Failed'
    }
}


}
