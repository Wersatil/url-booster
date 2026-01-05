package url.booster.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import url.booster.application.service.url.UrlService;

import java.net.URI;

@RestController
@RequiredArgsConstructor
public class UrlRestController {
    private final UrlService urlService;

    /*
    @PostMapping
    public ResponseEntity<ShortUrlDto> createShortUrl(@RequestBody @Valid CreateUrlDto createShortUrlDto) {
        ShortUrlDto result = urlService.createShortUrl(createShortUrlDto);
        return ResponseEntity
                .created(URI.create(result.shortUrl()))
                .body(result);
    }

     */

    @GetMapping("/{alias}")
    public ResponseEntity<Void> passOriginalUrl(@PathVariable String alias) {
        return ResponseEntity
                .status(HttpStatus.FOUND)
                .location(URI.create(urlService.getOriginalUrl(alias)))
                .build();
    }
}
