def call() {
    sh '''
        echo "mysql-data/" > .dockerignore
        echo "*.pem" >> .dockerignore
        echo "*.cnf" >> .dockerignore
        echo "*.key" >> .dockerignore
        echo "Docker ignore file created automatically"
    '''
}
