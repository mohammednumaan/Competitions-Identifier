package com.calendarbackend.calendarbackend;

import com.calendarbackend.calendarbackend.helperClasses.parseEventData;
import com.calendarbackend.calendarbackend.objects.CalendarEvent;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

// sends a json response at the endpoint
// with the parsed data (events)
@RestController
public class RouteController {
    @GetMapping("/eventsData")
    @CrossOrigin(origins = "http://localhost:5173")
    public String getEventData() throws ParseException {
        List<CalendarEvent> allEvents = parseEventData.parseExcelData("src/main/resources/hackathons.xlsx");
        Gson gson = new Gson();
        return gson.toJson(allEvents);
    }
}
