CREATE TABLE candidates (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    gender VARCHAR(10),
    expectedSalary DOUBLE
);

INSERT INTO candidates (name, email, gender, expectedSalary) VALUES
('John Doe', 'john.doe@example.com', 'Male', 70000),
('Jane Smith', 'jane.smith@example.com', 'Female', 75000),
('Alice Johnson', 'alice.johnson@example.com', 'Female', 80000),
('Bob Brown', 'bob.brown@example.com', 'Male', 65000),
('Charlie Davis', 'charlie.davis@example.com', 'Male', 72000);