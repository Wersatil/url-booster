package url.booster.application.service.url;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import url.booster.persistence.jpa.entity.Url;
import url.booster.persistence.jpa.repository.UrlRepository;
import url.booster.web.exception.InvalidUrlException;

@Service
@Slf4j
@RequiredArgsConstructor
public class UrlServiceImpl implements UrlService {
    //Мы здесь пока все делаем просто через Postgres, без Redis, потому что пользователей крайне мало, проблем
    // никаких нет
    private final UrlRepository urlRepository;

    public String getOriginalUrl(String customUrl) {
        Url url = urlRepository.findByCustomUrl(customUrl)
                .orElseThrow(() -> new InvalidUrlException("Данного URL не существует"));
        return url.getOriginalUrl();
    }
}
