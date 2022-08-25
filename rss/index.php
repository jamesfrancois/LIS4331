<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="utf-8">
        <title>RSS Feeds</title>
    </head>
    <body>
        <?php
        //Note: rss specification: https://validator.w3.org/feed/docs.rss2.html
        
        $html="";
        $publisher = "The CNN News";
        $url = "http://rss.cnn.com/rss/cnn_topstories.rss'";

        $html .= '<h2>' .$publisher .'</h2>';
        $html .= $url;

        $rss = simplexml_load_file($url);
        $count = 0;
        $html .= '<ul>';
        foreach($rss->channel->item as $item)
        {
            $count++;
            if($count > 10)
            {
                break;
            }
            $html .= '<li><a href="'.htmlspecialchars($item->link).'">'. htmlspecialchars($item->title).'</a><br/>';
            $html .= htmlspecialchars($item->description) .'<br/>';
            $html .= htmlspecialchars($item->pubDate).'</li><br/>';
        }
        $html .= '</ul>';

        print $html;
        ?>
    </body>
</html>