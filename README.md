# EurekaServer-CloudGateWay-Feign-Integration

# 1. Name : eureka-client-1  Port: 8761
http://localhost:8761/

# 2. Name : eureka-client-1  Port: 8061
http://localhost:8061/eureka-client-1/hello

# 3. Name : eureka-client-2  Port: 8062
http://localhost:8062/eureka-client-2/hello

# 4. Name : eureka-client-3-load-balance  Port: 8063
http://localhost:8063/eureka-client-3-load-balancer/hello

# 5. Name : Spring-cloud-gateway-service  Port : 8888
http://localhost:8888/eureka-client-1/eureka-client-1/hello

# 6. Name : feign-service  Port : 8064
http://localhost:8064/feign-service/client1 
The above feign service is calling http://localhost:8888/eureka-client-1/eureka-client-1/hello  which is calling http://localhost:8061/eureka-client-1/hello
