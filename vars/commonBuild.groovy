// vars/commonBuild.groovy

def call(Map config = [:]) {
    stage('Checkout') {
        checkout scm
    }

    stage('Unit Tests') {
        echo 'Running unit tests...'
        sh './gradlew test'
    }

    stage('Deploy') {
        def env = config.env ?: 'dev'
        echo "Deploying to environment: ${env}"
        // You can replace this with actual deployment commands
        // Example: sh "./deploy.sh ${env}"
    }
}
