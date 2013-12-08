require 'anemone'

#db = Mongo::Connection.new.db('vacatures_db')
#cv_collection = db['cv']

def crawl(siteurl)
	Anemone.crawl(siteurl) do |anemone|
		anemone.focus_crawl { |page| page.links.slice(0..100) }

		anemone.on_every_page do |page|
			work_titles = []
			work_company = []
			work_dates = []
			work_description = []
			edu_titles = []
			edu_name = []
			edu_address = []
			edu_dates = []
			
			pageurl = page.url  #de originele url
			name = page.doc.at_xpath("//h1[@id='resume-contact']").text rescue nil #naam persoon cv
			
			skills = page.doc.at_xpath("//*[@id='skills-section']/div/p").text rescue nil
			info = page.doc.at_xpath("//*[@id='additionalinfo-section']/div/p").text rescue nil
			
			work_titles.push page.doc.at_xpath("//*[@id='work-experience-items']/div/div[@class='data_display']/p[@class='work_title title']").text rescue nil
			work_company.push page.doc.at_xpath("//*[@id='work-experience-items']/div/div[@class='data_display']/div[@class='work_company']/span[@clsss='bold']").text rescue nil
			work_dates.push page.doc.at_xpath("//*[@id='work-experience-items']/div/div[@class='data_display']/p[@class='work_dates']").text rescue nil
			work_description.push page.doc.at_xpath("//*[@id='work-experience-items']/div/div[@class='data_display']/p[@class='work_description']").text rescue nil
			
			edu_titles.push page.doc.at_xpath("//*[@id='education-items']/div/div[@class='data_display']/p[class='edu_title']").text rescue nil
			edu_name.push page.doc.at_xpath("//*[@id='education-items']/div/div[@class='data_display']/div[@class='edu_school']/span[@itemprop='name']").text rescue nil
			edu_address.push page.doc.at_xpath("//*[@id='education-items']/div/div[@class='data_display']/div[@class='edu_school']/div[@itemprop='address']/span[@itemprop='addressLocality']").text rescue nil
			edu_dates.push page.doc.at_xpath("//*[@id='education-items']/div/div[@class='data_display']/p[@class='edu_dates']").text rescue nil
			
			if name

			end
		end
	end
end

crawl("http://www.indeed.com/resumes?l=Zuid-Holland")
crawl("http://www.indeed.com/resumes?l=Noord-Brabant")
crawl("http://www.indeed.com/resumes?l=Noord-Holland")
crawl("http://www.indeed.com/resumes/in-Utrecht")
crawl("http://www.indeed.com/resumes/in-Groningen")
crawl("http://www.indeed.com/resumes/in-Limburg")
crawl("http://www.indeed.com/resumes/in-Friesland")
crawl("http://www.indeed.com/resumes/in-drenthe")
crawl("http://www.indeed.com/resumes/in-overijssel")
crawl("http://www.indeed.com/resumes/in-Flevoland")
crawl("http://www.indeed.com/resumes/in-zeeland")
crawl("http://www.indeed.com/resumes/in-gelderland")
