function wordFrequencyAnalyzer(text) {
    const words = text.toLowerCase().match(/\b\w+\b/g);
    const frequencyMap = {};

    words.forEach((word) => {
        if (frequencyMap[word])
            frequencyMap[word]++;
        else
            frequencyMap[word] = 1;
    });

    return Object.entries(frequencyMap).sort((a, b) => b[1] - a[1]);
}

const inputText = "This is a test. This is only a test.";
console.log(wordFrequencyAnalyzer(inputText));