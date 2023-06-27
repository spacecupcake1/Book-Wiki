# Use a base image, for example, nginx
FROM nginx:latest

# Create directories for caching and logs
RUN mkdir -p /var/cache/nginx/client_temp \
    && mkdir -p /var/log/nginx \
    && touch /var/run/nginx.pid \
    && chown -R nginx:nginx /var/cache/nginx /var/log/nginx /var/run/nginx.pid

# Copy the HTML files
COPY ./HTML /usr/share/nginx/html

# Copy the CSS files
COPY ./CSS /usr/share/nginx/html/CSS

# Copy the JavaScript files
COPY ./JS /usr/share/nginx/html/JS

# Copy the images
COPY ./Images /usr/share/nginx/html/Images

# Set permissions for the copied files
RUN chmod -R 755 /usr/share/nginx/html

# Set NGINX to run as a non-root user
USER nginx

# Expose port 80 (default HTTP port)
EXPOSE 80

# Start the NGINX server when the container launches
CMD ["nginx", "-g", "daemon off;"]
