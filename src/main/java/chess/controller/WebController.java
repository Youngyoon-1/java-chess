package chess.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import chess.dto.MoveDto;
import chess.service.ChessService;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
//import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.*;

@Controller
public class WebController {

    private final Gson gson = new Gson();
    private final ChessService chessService = new ChessService();

//    public void run() {
//
//        get("/", (request, response) -> new HandlebarsTemplateEngine().render(new ModelAndView(null, "index.html")));
//
//        get("/start", (request, response) -> gson.toJson(chessService.newGame()));
//
//        get("/restart", (request, response) -> gson.toJson(chessService.loadGame()));
//
//        put("/move", (request, response) -> move(request));
//
//        exception(RuntimeException.class, (exception, request, response) -> handleException(exception, response));
//    }

    @GetMapping("/")
    public String showFirstPage() {
        return "main";
//        return new HandlebarsTemplateEngine().render(new ModelAndView(null, "main.hbs"));
    }

//    private String move(final Request request) {
//        final var moveDto = gson.fromJson(request.body(), MoveDto.class);
//        return gson.toJson(chessService.move(moveDto.getFrom(), moveDto.getTo()));
//    }
//
//    private void handleException(final Exception exception, final Response response) {
//        response.status(500);
//        response.body(gson.toJson(exception.getMessage()));
//    }
}
