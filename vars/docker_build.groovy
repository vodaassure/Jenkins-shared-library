def call() {
    sh '''
        docker build -t two-tier-flask-app .
        echo "Docker image build is done"
    '''
}