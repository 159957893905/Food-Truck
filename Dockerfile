FROM alibabadragonwell/dragonwell:17-anolis

ARG JAR_FILE=target/food-truck.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENV TZ=Asia/Shanghai JAVA_OPTS="-Xms512m -Xmx512m"

CMD sleep 60; java $JAVA_OPTS -jar app.jar