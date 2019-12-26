package com.github.tenx.tecnoesis20.data;

import com.github.tenx.tecnoesis20.data.rest.about.sponsors.SponsorsApiService;
import com.github.tenx.tecnoesis20.data.rest.about.teams.TeamsApiService;
import com.github.tenx.tecnoesis20.data.rest.events.EventsApiService;

public interface AppDataManagerHelper extends EventsApiService , SponsorsApiService , TeamsApiService {
}
