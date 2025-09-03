CREATE TABLE intern_activity (
    id BIGSERIAL PRIMARY KEY,
    intern_id VARCHAR(255) NOT NULL,
    "timestamp" TIMESTAMP NOT NULL,
    cpu_usage DOUBLE PRECISION,
    memory_usage DOUBLE PRECISION,
    network_in_kb DOUBLE PRECISION,
    network_out_kb DOUBLE PRECISION
);
