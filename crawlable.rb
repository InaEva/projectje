require 'anemone'
 require 'pp'
 
Anemone.crawl("http://www.jobbird.com/nl/vacatures/34/nederland") do |anemone|
 
        anemone.skip_links_like(/\.aspx\??.*/)
        anemone.skip_links_like(/browse\/.*/)
   
        anemone.focus_crawl { |page| page.links.slice(0..20) }
 
        anemone.on_every_page do |page|
                begin
                if(page.doc.css('h1.vacature-titel-blok').text.strip != "")
                            infos = []
                            description = page.doc.css('.vacatureSubtitels').text
                            page.doc.css('#content-vacinfo .BoldFont').each do |info_label|
                              link_key = ''
                              link_value = ''
                              link_url = ''
                             
                              link_key = info_label.text.strip
                             
                              info_label_value = info_label.next
                              if info_label_value.elements.length > 0
                                link_value = info_label_value.elements[0].text.strip
                                info_label_value.elements[0].collect do |e|
                                  link_url = e[1]
                                end
                              else
                                link_value = info_label_value.text.strip
                              end
                              info = {
                                :label => link_key,
                                :value => link_value,
                                :url => link_url
                              }
                              infos.push info
                            end
 
                            job = {
                              :title => page.doc.css('h1.vacature-titel-blok').text.strip,
                              :url => page.url.to_s(),
                              :description => description,
                              :infos => infos
                            }
                            pp job
                            puts
                            puts
                        end
                rescue Exception => e
                next
                end
        end
end
