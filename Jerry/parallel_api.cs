using System;
using System.Collections.Concurrent;
using System.Net.Http;
using System.Threading.Tasks;

class Program
{
    static async Task Main()
    {
        var urls = new string[]
        {
            "https://api.example.com/data1",
            "https://api.example.com/data2",
            "https://api.example.com/data3"
        };

        await CallApisInParallel(urls);
    }

    static async Task CallApisInParallel(string[] urls)
    {
        using (var httpClient = new HttpClient())
        {
            var responses = new ConcurrentBag<string>();

            await Task.Run(() => Parallel.ForEach(urls, async (url) =>
            {
                var response = await CallApiAsync(url, httpClient);
                responses.Add(response);
            }));

            foreach (var response in responses)
            {
                Console.WriteLine(response);
            }
        }
    }

    static async Task<string> CallApiAsync(string url, HttpClient httpClient)
    {
        var response = await httpClient.GetAsync(url);
        response.EnsureSuccessStatusCode();
        return await response.Content.ReadAsStringAsync();
    }
}